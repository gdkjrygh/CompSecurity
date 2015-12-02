.class Lcom/facebook/common/c/c;
.super Ljava/lang/Object;
.source "FbSdcardLogger.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:I

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/facebook/common/c/a;


# direct methods
.method constructor <init>(Lcom/facebook/common/c/a;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 96
    iput-object p1, p0, Lcom/facebook/common/c/c;->d:Lcom/facebook/common/c/a;

    iput p2, p0, Lcom/facebook/common/c/c;->a:I

    iput-object p3, p0, Lcom/facebook/common/c/c;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/facebook/common/c/c;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 99
    iget-object v0, p0, Lcom/facebook/common/c/c;->d:Lcom/facebook/common/c/a;

    invoke-static {v0}, Lcom/facebook/common/c/a;->b(Lcom/facebook/common/c/a;)Lcom/facebook/common/c/d;

    move-result-object v0

    iget v1, p0, Lcom/facebook/common/c/c;->a:I

    iget-object v2, p0, Lcom/facebook/common/c/c;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/facebook/common/c/c;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/common/c/d;->a(Lcom/facebook/common/c/d;ILjava/lang/String;Ljava/lang/String;)V

    .line 100
    return-void
.end method
