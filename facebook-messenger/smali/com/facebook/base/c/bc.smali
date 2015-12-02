.class Lcom/facebook/base/c/bc;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


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
.field final synthetic a:Lcom/facebook/base/c/a;

.field private final b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/facebook/base/c/a;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 596
    iput-object p1, p0, Lcom/facebook/base/c/bc;->a:Lcom/facebook/base/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    .line 597
    iput-object p2, p0, Lcom/facebook/base/c/bc;->b:Ljava/lang/String;

    .line 598
    return-void
.end method


# virtual methods
.method public b()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 603
    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/bc;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lcom/facebook/base/c/bc;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
