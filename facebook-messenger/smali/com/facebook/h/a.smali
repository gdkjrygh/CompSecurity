.class public Lcom/facebook/h/a;
.super Ljava/lang/Object;
.source "LogController.java"

# interfaces
.implements Lcom/facebook/base/c;


# instance fields
.field private final a:Lcom/facebook/prefs/shared/d;

.field private final b:Lcom/facebook/prefs/shared/f;

.field private final c:Lcom/facebook/config/a/a;

.field private final d:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/config/a/a;Ljavax/inject/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/prefs/shared/d;",
            "Lcom/facebook/config/a/a;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/h/a;->a:Lcom/facebook/prefs/shared/d;

    .line 30
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/a/a;

    iput-object v0, p0, Lcom/facebook/h/a;->c:Lcom/facebook/config/a/a;

    .line 31
    iput-object p3, p0, Lcom/facebook/h/a;->d:Ljavax/inject/a;

    .line 32
    new-instance v0, Lcom/facebook/h/b;

    invoke-direct {v0, p0}, Lcom/facebook/h/b;-><init>(Lcom/facebook/h/a;)V

    iput-object v0, p0, Lcom/facebook/h/a;->b:Lcom/facebook/prefs/shared/f;

    .line 42
    iget-object v0, p0, Lcom/facebook/h/a;->a:Lcom/facebook/prefs/shared/d;

    iget-object v1, p0, Lcom/facebook/h/a;->b:Lcom/facebook/prefs/shared/f;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/f;)V

    .line 44
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 80
    invoke-virtual {p0}, Lcom/facebook/h/a;->b()V

    .line 81
    return-void
.end method

.method public b()V
    .locals 4

    .prologue
    const/4 v1, -0x1

    .line 47
    iget-object v0, p0, Lcom/facebook/h/a;->a:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/prefs/shared/aj;->i:Lcom/facebook/prefs/shared/ae;

    const-string v3, "-1"

    invoke-interface {v0, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 52
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 56
    :goto_0
    if-eq v0, v1, :cond_0

    .line 57
    invoke-static {v0}, Lcom/facebook/debug/log/b;->a(I)V

    .line 76
    :goto_1
    return-void

    .line 53
    :catch_0
    move-exception v0

    move v0, v1

    .line 54
    goto :goto_0

    .line 60
    :cond_0
    sget-object v0, Lcom/facebook/h/c;->a:[I

    iget-object v1, p0, Lcom/facebook/h/a;->c:Lcom/facebook/config/a/a;

    invoke-virtual {v1}, Lcom/facebook/config/a/a;->h()Lcom/facebook/config/a/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/config/a/b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 67
    iget-object v0, p0, Lcom/facebook/h/a;->d:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 68
    const/4 v0, 0x4

    .line 74
    :goto_2
    invoke-static {v0}, Lcom/facebook/debug/log/b;->a(I)V

    goto :goto_1

    .line 62
    :pswitch_0
    const/4 v0, 0x3

    .line 63
    goto :goto_2

    .line 70
    :cond_1
    const/4 v0, 0x5

    goto :goto_2

    .line 60
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
