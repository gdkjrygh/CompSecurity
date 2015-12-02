.class public Lcom/facebook/orca/app/a;
.super Ljava/lang/Object;
.source "FpsEnableFlagsProvider.java"

# interfaces
.implements Ljavax/inject/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/a",
        "<",
        "Ljava/util/Set",
        "<",
        "Lcom/facebook/debug/fps/k;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final a:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/common/w/q;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/facebook/prefs/shared/d;


# direct methods
.method public constructor <init>(Ljavax/inject/a;Lcom/facebook/prefs/shared/d;)V
    .locals 0
    .param p1    # Ljavax/inject/a;
        .annotation runtime Lcom/facebook/auth/annotations/IsMeUserAnEmployee;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/common/w/q;",
            ">;",
            "Lcom/facebook/prefs/shared/d;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/facebook/orca/app/a;->a:Ljavax/inject/a;

    .line 31
    iput-object p2, p0, Lcom/facebook/orca/app/a;->b:Lcom/facebook/prefs/shared/d;

    .line 32
    return-void
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/debug/fps/k;",
            ">;"
        }
    .end annotation

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/orca/app/a;->a:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    if-eq v0, v1, :cond_0

    .line 37
    const-class v0, Lcom/facebook/debug/fps/k;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    .line 42
    :goto_0
    return-object v0

    .line 39
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/app/a;->b:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/prefs/shared/aj;->q:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 40
    const-class v0, Lcom/facebook/debug/fps/k;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    goto :goto_0

    .line 42
    :cond_1
    sget-object v0, Lcom/facebook/debug/fps/k;->ENABLE:Lcom/facebook/debug/fps/k;

    sget-object v1, Lcom/facebook/debug/fps/k;->ENABLE_FRAME_COUNTER:Lcom/facebook/debug/fps/k;

    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    goto :goto_0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 21
    invoke-virtual {p0}, Lcom/facebook/orca/app/a;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
