.class public Lcom/facebook/orca/chatheads/dy;
.super Ljava/lang/Object;
.source "IsChatHeadsPermittedProvider.java"

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

.field private static final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final c:Landroid/content/Context;

.field private final d:Lcom/facebook/prefs/shared/d;

.field private final e:Lcom/facebook/config/a/a;

.field private final f:Landroid/content/res/Resources;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    const-class v0, Lcom/facebook/orca/chatheads/dy;

    sput-object v0, Lcom/facebook/orca/chatheads/dy;->b:Ljava/lang/Class;

    .line 29
    const-string v0, "messenger_chat_heads_android"

    invoke-static {v0}, Lcom/facebook/f/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/chatheads/dy;->a:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/prefs/shared/d;Lcom/facebook/config/a/a;Landroid/content/res/Resources;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/facebook/orca/chatheads/dy;->c:Landroid/content/Context;

    .line 44
    iput-object p2, p0, Lcom/facebook/orca/chatheads/dy;->d:Lcom/facebook/prefs/shared/d;

    .line 45
    iput-object p3, p0, Lcom/facebook/orca/chatheads/dy;->e:Lcom/facebook/config/a/a;

    .line 46
    iput-object p4, p0, Lcom/facebook/orca/chatheads/dy;->f:Landroid/content/res/Resources;

    .line 47
    return-void
.end method

.method private c()Z
    .locals 6

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dy;->f:Landroid/content/res/Resources;

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 51
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v2, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 52
    iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v3, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 54
    iget-object v3, p0, Lcom/facebook/orca/chatheads/dy;->f:Landroid/content/res/Resources;

    sget v4, Lcom/facebook/g;->chat_heads_minimum_portrait_width:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    .line 56
    iget-object v4, p0, Lcom/facebook/orca/chatheads/dy;->f:Landroid/content/res/Resources;

    sget v5, Lcom/facebook/g;->chat_heads_minimum_portrait_height:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    .line 59
    if-lt v1, v3, :cond_0

    if-ge v2, v4, :cond_1

    .line 60
    :cond_0
    sget-object v1, Lcom/facebook/orca/chatheads/dy;->b:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "screen size not supported: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 61
    const/4 v0, 0x0

    .line 64
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 69
    iget-object v1, p0, Lcom/facebook/orca/chatheads/dy;->d:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/orca/chatheads/dy;->a:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v1

    if-nez v1, :cond_0

    .line 70
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 84
    :goto_0
    return-object v0

    .line 74
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/chatheads/dy;->c:Landroid/content/Context;

    const-string v2, "android.permission.SYSTEM_ALERT_WINDOW"

    invoke-virtual {v1, v2}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    .line 76
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    .line 79
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dy;->c()Z

    move-result v1

    if-nez v1, :cond_2

    .line 80
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    .line 83
    :cond_2
    iget-object v1, p0, Lcom/facebook/orca/chatheads/dy;->e:Lcom/facebook/config/a/a;

    invoke-virtual {v1}, Lcom/facebook/config/a/a;->i()Lcom/facebook/config/a/d;

    move-result-object v1

    .line 84
    sget-object v2, Lcom/facebook/config/a/d;->MESSENGER:Lcom/facebook/config/a/d;

    if-ne v1, v2, :cond_3

    const/4 v0, 0x1

    :cond_3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 27
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/dy;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
