.class Lcom/aetn/history/android/historyhere/view/SuggestActivity$2;
.super Ljava/lang/Object;
.source "SuggestActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/view/SuggestActivity;->setListeners()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    .prologue
    .line 151
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$2;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const/4 v5, 0x0

    .line 155
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$2;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mContext:Landroid/content/Context;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$000(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Landroid/content/Context;

    move-result-object v2

    const-string v3, "input_method"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 157
    .local v1, "imm":Landroid/view/inputmethod/InputMethodManager;
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$2;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mPlaceName:Landroid/widget/EditText;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$600(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Landroid/widget/EditText;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    invoke-virtual {v1, v2, v5}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 158
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$2;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mAddress:Landroid/widget/EditText;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$200(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Landroid/widget/EditText;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    invoke-virtual {v1, v2, v5}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 159
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$2;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mCity:Landroid/widget/EditText;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$300(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Landroid/widget/EditText;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    invoke-virtual {v1, v2, v5}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 160
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$2;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mState:Landroid/widget/EditText;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$400(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Landroid/widget/EditText;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    invoke-virtual {v1, v2, v5}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 161
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$2;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mZip:Landroid/widget/EditText;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$500(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Landroid/widget/EditText;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    invoke-virtual {v1, v2, v5}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 162
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$2;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mDescription:Landroid/widget/EditText;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$700(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Landroid/widget/EditText;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    invoke-virtual {v1, v2, v5}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 163
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$2;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # invokes: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->checkForErrors()Ljava/lang/String;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$800(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Ljava/lang/String;

    move-result-object v0

    .line 164
    .local v0, "errors":Ljava/lang/String;
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 165
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$2;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    new-instance v3, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$2;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    invoke-direct {v3, v4}, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;-><init>(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)V

    # setter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestionData:Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;
    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$902(Lcom/aetn/history/android/historyhere/view/SuggestActivity;Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;)Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;

    .line 166
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$2;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestionData:Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$900(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;

    move-result-object v2

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$2;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mPlaceName:Landroid/widget/EditText;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$600(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Landroid/widget/EditText;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->placeName:Ljava/lang/String;

    .line 167
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$2;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestionData:Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$900(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;

    move-result-object v2

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$2;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mAddress:Landroid/widget/EditText;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$200(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Landroid/widget/EditText;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->address:Ljava/lang/String;

    .line 168
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$2;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestionData:Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$900(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;

    move-result-object v2

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$2;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mCity:Landroid/widget/EditText;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$300(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Landroid/widget/EditText;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->city:Ljava/lang/String;

    .line 169
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$2;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestionData:Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$900(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;

    move-result-object v2

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$2;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mState:Landroid/widget/EditText;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$400(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Landroid/widget/EditText;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->state:Ljava/lang/String;

    .line 170
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$2;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestionData:Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$900(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;

    move-result-object v2

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$2;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mZip:Landroid/widget/EditText;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$500(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Landroid/widget/EditText;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->zip:Ljava/lang/String;

    .line 171
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$2;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestionData:Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$900(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;

    move-result-object v2

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$2;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mDescription:Landroid/widget/EditText;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$700(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Landroid/widget/EditText;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->historicalSignificance:Ljava/lang/String;

    .line 174
    new-instance v2, Lcom/aetn/history/android/historyhere/view/SuggestActivity$AddressLookupTask;

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$2;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    invoke-direct {v2, v3}, Lcom/aetn/history/android/historyhere/view/SuggestActivity$AddressLookupTask;-><init>(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)V

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$2;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestionData:Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$900(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;->getAddressForSearch()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {v2, v3}, Lcom/aetn/history/android/historyhere/view/SuggestActivity$AddressLookupTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 178
    :goto_0
    return-void

    .line 176
    :cond_0
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$2;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # invokes: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->setErrorMessage(Ljava/lang/String;)V
    invoke-static {v2, v0}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$1000(Lcom/aetn/history/android/historyhere/view/SuggestActivity;Ljava/lang/String;)V

    goto :goto_0
.end method
