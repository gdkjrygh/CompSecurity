.class public Lcom/facebook/orca/activity/m;
.super Lcom/facebook/base/activity/a;
.source "MessengerLoginFlowHelper.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/orca/nux/h;

.field private final c:Lcom/facebook/orca/c/a;

.field private d:Ljava/lang/String;

.field private e:Landroid/content/Intent;

.field private f:Landroid/content/ComponentName;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22
    const-class v0, Lcom/facebook/orca/activity/m;

    sput-object v0, Lcom/facebook/orca/activity/m;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/nux/h;Lcom/facebook/orca/c/a;Landroid/content/ComponentName;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/facebook/base/activity/a;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/facebook/orca/activity/m;->b:Lcom/facebook/orca/nux/h;

    .line 37
    iput-object p2, p0, Lcom/facebook/orca/activity/m;->c:Lcom/facebook/orca/c/a;

    .line 38
    iput-object p3, p0, Lcom/facebook/orca/activity/m;->f:Landroid/content/ComponentName;

    .line 39
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 42
    const-string v0, "orca:loginparam:ReturnUri"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/activity/m;->d:Ljava/lang/String;

    .line 43
    const-string v0, "orca:loginparam:ReturnIntent"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;

    iput-object v0, p0, Lcom/facebook/orca/activity/m;->e:Landroid/content/Intent;

    .line 44
    return-void
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/orca/activity/m;->c:Lcom/facebook/orca/c/a;

    invoke-virtual {v0}, Lcom/facebook/orca/c/a;->a()Z

    move-result v0

    return v0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/facebook/orca/activity/m;->b:Lcom/facebook/orca/nux/h;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/h;->i()Z

    move-result v0

    return v0
.end method

.method public m(Landroid/app/Activity;)Landroid/content/Intent;
    .locals 3

    .prologue
    .line 52
    iget-object v0, p0, Lcom/facebook/orca/activity/m;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 53
    sget-object v0, Lcom/facebook/orca/activity/m;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Going to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/activity/m;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 54
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    iget-object v2, p0, Lcom/facebook/orca/activity/m;->d:Ljava/lang/String;

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 67
    :goto_0
    return-object v0

    .line 55
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/activity/m;->e:Landroid/content/Intent;

    if-eqz v0, :cond_1

    .line 56
    sget-object v0, Lcom/facebook/orca/activity/m;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Going to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/activity/m;->e:Landroid/content/Intent;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 57
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/activity/m;->e:Landroid/content/Intent;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 58
    invoke-virtual {v0}, Landroid/content/Intent;->getFlags()I

    move-result v1

    const v2, -0x10000001

    and-int/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    goto :goto_0

    .line 59
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/orca/activity/m;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 60
    sget-object v0, Lcom/facebook/orca/activity/m;->a:Ljava/lang/Class;

    const-string v1, "Going to NUX."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 61
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/facebook/orca/nux/NUXActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_0

    .line 63
    :cond_2
    sget-object v0, Lcom/facebook/orca/activity/m;->a:Ljava/lang/Class;

    const-string v1, "Going to threadlist."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 64
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 65
    iget-object v1, p0, Lcom/facebook/orca/activity/m;->f:Landroid/content/ComponentName;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    goto :goto_0
.end method
