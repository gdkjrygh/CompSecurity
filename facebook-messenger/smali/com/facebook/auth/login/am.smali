.class public Lcom/facebook/auth/login/am;
.super Ljava/lang/Object;
.source "LoginAfterAuthCoordinator.java"


# instance fields
.field private final a:Lcom/facebook/prefs/shared/d;


# direct methods
.method public constructor <init>(Lcom/facebook/prefs/shared/d;)V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/facebook/auth/login/am;->a:Lcom/facebook/prefs/shared/d;

    .line 14
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 17
    iget-object v1, p0, Lcom/facebook/auth/login/am;->a:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/prefs/shared/aj;->g:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v1

    if-nez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()V
    .locals 3

    .prologue
    .line 21
    iget-object v0, p0, Lcom/facebook/auth/login/am;->a:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/prefs/shared/aj;->g:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 25
    return-void
.end method

.method public c()V
    .locals 3

    .prologue
    .line 28
    iget-object v0, p0, Lcom/facebook/auth/login/am;->a:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/prefs/shared/aj;->g:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 32
    return-void
.end method
