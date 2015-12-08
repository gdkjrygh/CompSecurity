.class Lcom/google/zxing/client/android/result/ProductResultHandler$1;
.super Ljava/lang/Object;
.source "ProductResultHandler.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/zxing/client/android/result/ProductResultHandler;-><init>(Landroid/app/Activity;Lcom/google/zxing/client/result/ParsedResult;Lcom/google/zxing/Result;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/zxing/client/android/result/ProductResultHandler;


# direct methods
.method constructor <init>(Lcom/google/zxing/client/android/result/ProductResultHandler;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/google/zxing/client/android/result/ProductResultHandler$1;->this$0:Lcom/google/zxing/client/android/result/ProductResultHandler;

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 45
    iget-object v1, p0, Lcom/google/zxing/client/android/result/ProductResultHandler$1;->this$0:Lcom/google/zxing/client/android/result/ProductResultHandler;

    invoke-virtual {v1}, Lcom/google/zxing/client/android/result/ProductResultHandler;->getResult()Lcom/google/zxing/client/result/ParsedResult;

    move-result-object v0

    check-cast v0, Lcom/google/zxing/client/result/ProductParsedResult;

    .line 46
    .local v0, "productResult":Lcom/google/zxing/client/result/ProductParsedResult;
    iget-object v1, p0, Lcom/google/zxing/client/android/result/ProductResultHandler$1;->this$0:Lcom/google/zxing/client/android/result/ProductResultHandler;

    invoke-virtual {v0}, Lcom/google/zxing/client/result/ProductParsedResult;->getNormalizedProductID()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/zxing/client/android/result/ProductResultHandler;->openGoogleShopper(Ljava/lang/String;)V

    .line 47
    return-void
.end method
