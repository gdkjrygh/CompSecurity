.class public Lcom/facebook/inject/ar;
.super Lcom/facebook/inject/d;
.source "RedirectProvider.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/facebook/inject/d",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/a",
            "<+TT;>;"
        }
    .end annotation
.end field

.field private volatile b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<+TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/a",
            "<+TT;>;)V"
        }
    .end annotation

    .prologue
    .line 17
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/facebook/inject/ar;->a:Lcom/google/inject/a;

    .line 19
    return-void
.end method


# virtual methods
.method public b()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 23
    iget-object v0, p0, Lcom/facebook/inject/ar;->b:Ljavax/inject/a;

    if-nez v0, :cond_0

    .line 24
    iget-object v0, p0, Lcom/facebook/inject/ar;->a:Lcom/google/inject/a;

    invoke-virtual {p0, v0}, Lcom/facebook/inject/ar;->b(Lcom/google/inject/a;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/inject/ar;->b:Ljavax/inject/a;

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/facebook/inject/ar;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
