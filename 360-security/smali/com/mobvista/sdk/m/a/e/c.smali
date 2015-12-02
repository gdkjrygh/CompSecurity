.class public abstract Lcom/mobvista/sdk/m/a/e/c;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:I

.field protected c:Z

.field protected d:Lcom/mobvista/sdk/m/a/e/d;

.field protected e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-boolean v0, p0, Lcom/mobvista/sdk/m/a/e/c;->c:Z

    .line 14
    iput v0, p0, Lcom/mobvista/sdk/m/a/e/c;->e:I

    .line 15
    const/4 v0, 0x0

    iput v0, p0, Lcom/mobvista/sdk/m/a/e/c;->a:I

    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method final a(I)V
    .locals 0

    .prologue
    .line 18
    iput p1, p0, Lcom/mobvista/sdk/m/a/e/c;->a:I

    .line 19
    return-void
.end method

.method public final a(Lcom/mobvista/sdk/m/a/e/d;)V
    .locals 0

    .prologue
    .line 26
    iput-object p1, p0, Lcom/mobvista/sdk/m/a/e/c;->d:Lcom/mobvista/sdk/m/a/e/d;

    .line 27
    return-void
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 22
    iget v0, p0, Lcom/mobvista/sdk/m/a/e/c;->a:I

    return v0
.end method

.method public run()V
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/e/c;->d:Lcom/mobvista/sdk/m/a/e/d;

    if-eqz v0, :cond_0

    .line 33
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/e/c;->d:Lcom/mobvista/sdk/m/a/e/d;

    invoke-interface {v0, p0}, Lcom/mobvista/sdk/m/a/e/d;->a(Lcom/mobvista/sdk/m/a/e/c;)V

    .line 37
    :cond_0
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/a/e/c;->a()V

    .line 39
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/e/c;->d:Lcom/mobvista/sdk/m/a/e/d;

    if-eqz v0, :cond_1

    .line 40
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/e/c;->d:Lcom/mobvista/sdk/m/a/e/d;

    invoke-interface {v0, p0}, Lcom/mobvista/sdk/m/a/e/d;->b(Lcom/mobvista/sdk/m/a/e/c;)V

    .line 43
    :cond_1
    return-void
.end method
