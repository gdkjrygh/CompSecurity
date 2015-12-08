.class public Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;
.super Ljava/lang/Object;
.source "SuggestActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/view/SuggestActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "SuggestionData"
.end annotation


# instance fields
.field public address:Ljava/lang/String;

.field public city:Ljava/lang/String;

.field public historicalSignificance:Ljava/lang/String;

.field public lat:D

.field public lng:D

.field public placeName:Ljava/lang/String;

.field public state:Ljava/lang/String;

.field final synthetic this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

.field public zip:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)V
    .locals 2
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    .prologue
    const-wide/16 v0, 0x0

    .line 391
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 392
    iput-wide v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->lat:D

    .line 393
    iput-wide v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->lng:D

    .line 394
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->placeName:Ljava/lang/String;

    .line 395
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->address:Ljava/lang/String;

    .line 396
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->city:Ljava/lang/String;

    .line 397
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->state:Ljava/lang/String;

    .line 398
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->zip:Ljava/lang/String;

    .line 399
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->historicalSignificance:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAddressForSearch()Ljava/lang/String;
    .locals 2

    .prologue
    .line 402
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->address:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->city:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->state:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->zip:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
