.class public Lcom/facebook/orca/prefs/g;
.super Lcom/facebook/inject/d;
.source "IsInternalPrefsEnabledProvider.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Lcom/facebook/prefs/shared/ae;


# instance fields
.field private final b:Lcom/facebook/prefs/shared/d;

.field private final c:Lcom/facebook/config/a/a;

.field private final d:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    const-string v0, "messenger_internal_prefs_android"

    invoke-static {v0}, Lcom/facebook/f/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/prefs/g;->a:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/config/a/a;Ljavax/inject/a;)V
    .locals 0
    .param p3    # Ljavax/inject/a;
        .annotation runtime Lcom/facebook/auth/annotations/LoggedInUser;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/prefs/shared/d;",
            "Lcom/facebook/config/a/a;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/User;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 39
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/facebook/orca/prefs/g;->b:Lcom/facebook/prefs/shared/d;

    .line 41
    iput-object p2, p0, Lcom/facebook/orca/prefs/g;->c:Lcom/facebook/config/a/a;

    .line 42
    iput-object p3, p0, Lcom/facebook/orca/prefs/g;->d:Ljavax/inject/a;

    .line 43
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 49
    iget-object v0, p0, Lcom/facebook/orca/prefs/g;->d:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 50
    if-nez v0, :cond_0

    .line 51
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 57
    :goto_0
    return-object v0

    .line 54
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/prefs/g;->c:Lcom/facebook/config/a/a;

    invoke-virtual {v1}, Lcom/facebook/config/a/a;->h()Lcom/facebook/config/a/b;

    move-result-object v1

    sget-object v2, Lcom/facebook/config/a/b;->PUBLIC:Lcom/facebook/config/a/b;

    if-ne v1, v2, :cond_1

    .line 55
    invoke-virtual {v0}, Lcom/facebook/user/User;->y()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    .line 57
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/prefs/g;->b:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/g;->a:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 26
    invoke-virtual {p0}, Lcom/facebook/orca/prefs/g;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
