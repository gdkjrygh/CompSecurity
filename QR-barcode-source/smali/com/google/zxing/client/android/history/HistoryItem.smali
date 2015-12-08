.class public final Lcom/google/zxing/client/android/history/HistoryItem;
.super Ljava/lang/Object;
.source "HistoryItem.java"


# instance fields
.field private final details:Ljava/lang/String;

.field private final display:Ljava/lang/String;

.field private final result:Lcom/google/zxing/Result;


# direct methods
.method constructor <init>(Lcom/google/zxing/Result;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "result"    # Lcom/google/zxing/Result;
    .param p2, "display"    # Ljava/lang/String;
    .param p3, "details"    # Ljava/lang/String;

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/google/zxing/client/android/history/HistoryItem;->result:Lcom/google/zxing/Result;

    .line 29
    iput-object p2, p0, Lcom/google/zxing/client/android/history/HistoryItem;->display:Ljava/lang/String;

    .line 30
    iput-object p3, p0, Lcom/google/zxing/client/android/history/HistoryItem;->details:Ljava/lang/String;

    .line 31
    return-void
.end method


# virtual methods
.method public getDisplayAndDetails()Ljava/lang/String;
    .locals 3

    .prologue
    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .local v0, "displayResult":Ljava/lang/StringBuilder;
    iget-object v1, p0, Lcom/google/zxing/client/android/history/HistoryItem;->display:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/zxing/client/android/history/HistoryItem;->display:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_2

    .line 40
    :cond_0
    iget-object v1, p0, Lcom/google/zxing/client/android/history/HistoryItem;->result:Lcom/google/zxing/Result;

    invoke-virtual {v1}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    :goto_0
    iget-object v1, p0, Lcom/google/zxing/client/android/history/HistoryItem;->details:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/zxing/client/android/history/HistoryItem;->details:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_1

    .line 45
    const-string v1, " : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/zxing/client/android/history/HistoryItem;->details:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1

    .line 42
    :cond_2
    iget-object v1, p0, Lcom/google/zxing/client/android/history/HistoryItem;->display:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method

.method public getResult()Lcom/google/zxing/Result;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/google/zxing/client/android/history/HistoryItem;->result:Lcom/google/zxing/Result;

    return-object v0
.end method
