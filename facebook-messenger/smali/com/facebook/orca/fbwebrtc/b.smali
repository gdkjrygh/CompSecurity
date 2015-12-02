.class public Lcom/facebook/orca/fbwebrtc/b;
.super Ljava/lang/Object;
.source "IsVoipEnabledForUserProvider.java"

# interfaces
.implements Ljavax/inject/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/a",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/facebook/prefs/shared/ae;

.field public static final b:Lcom/facebook/prefs/shared/ae;


# instance fields
.field private final c:Lcom/facebook/prefs/shared/d;

.field private final d:Lcom/facebook/config/a/a;

.field private final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    const-string v0, "messenger_voip_android"

    invoke-static {v0}, Lcom/facebook/f/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/fbwebrtc/b;->a:Lcom/facebook/prefs/shared/ae;

    .line 25
    const-string v0, "fb4a_voip_android"

    invoke-static {v0}, Lcom/facebook/f/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/fbwebrtc/b;->b:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/common/l/h;Lcom/facebook/prefs/shared/d;Lcom/facebook/config/a/a;)V
    .locals 2
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p2, p0, Lcom/facebook/orca/fbwebrtc/b;->c:Lcom/facebook/prefs/shared/d;

    .line 43
    iput-object p3, p0, Lcom/facebook/orca/fbwebrtc/b;->d:Lcom/facebook/config/a/a;

    .line 44
    const-string v0, "true"

    const-string v1, "com.facebook.vi"

    invoke-virtual {p1, v1}, Lcom/facebook/common/l/h;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/fbwebrtc/b;->e:Z

    .line 45
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 49
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x9

    if-ge v1, v2, :cond_0

    .line 50
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 57
    :goto_0
    return-object v0

    .line 52
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/b;->d:Lcom/facebook/config/a/a;

    invoke-virtual {v1}, Lcom/facebook/config/a/a;->i()Lcom/facebook/config/a/d;

    move-result-object v1

    sget-object v2, Lcom/facebook/config/a/d;->MESSENGER:Lcom/facebook/config/a/d;

    if-ne v1, v2, :cond_1

    .line 53
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/b;->c:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/orca/fbwebrtc/b;->a:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    .line 54
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/b;->d:Lcom/facebook/config/a/a;

    invoke-virtual {v1}, Lcom/facebook/config/a/a;->i()Lcom/facebook/config/a/d;

    move-result-object v1

    sget-object v2, Lcom/facebook/config/a/d;->FB4A:Lcom/facebook/config/a/d;

    if-ne v1, v2, :cond_3

    .line 55
    iget-boolean v1, p0, Lcom/facebook/orca/fbwebrtc/b;->e:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/b;->c:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/orca/fbwebrtc/b;->b:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v0, 0x1

    :cond_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    .line 57
    :cond_3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 21
    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/b;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
