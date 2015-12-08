.class public Lcom/aetn/history/android/historyhere/view/SuggestActivity;
.super Landroid/support/v4/app/FragmentActivity;
.source "SuggestActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;,
        Lcom/aetn/history/android/historyhere/view/SuggestActivity$AddressLookupTask;,
        Lcom/aetn/history/android/historyhere/view/SuggestActivity$PostSuggestionTask;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "SuggestActivity"


# instance fields
.field private localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

.field private mAddress:Landroid/widget/EditText;

.field private mCity:Landroid/widget/EditText;

.field private mContext:Landroid/content/Context;

.field private mDescription:Landroid/widget/EditText;

.field private mLocation:Landroid/location/Location;

.field private mOk:Landroid/widget/Button;

.field private mOr:Landroid/widget/TextView;

.field private mPlaceName:Landroid/widget/EditText;

.field private mState:Landroid/widget/EditText;

.field private mSubmit:Landroid/widget/Button;

.field private mSuggestPrompt:Landroid/view/ViewGroup;

.field private mSuggestPromptText:Landroid/widget/TextView;

.field private mSuggestPromptTitle:Landroid/widget/TextView;

.field private mSuggestionData:Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;

.field private mUseLocation:Landroid/widget/Button;

.field private mUsersLocation:Landroid/location/Location;

.field private mZip:Landroid/widget/EditText;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Landroid/support/v4/app/FragmentActivity;-><init>()V

    .line 391
    return-void
.end method

.method static synthetic access$000(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Landroid/content/Context;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    .prologue
    .line 45
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$1000(Lcom/aetn/history/android/historyhere/view/SuggestActivity;Ljava/lang/String;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/view/SuggestActivity;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 45
    invoke-direct {p0, p1}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->setErrorMessage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$102(Lcom/aetn/history/android/historyhere/view/SuggestActivity;Landroid/location/Location;)Landroid/location/Location;
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/view/SuggestActivity;
    .param p1, "x1"    # Landroid/location/Location;

    .prologue
    .line 45
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mLocation:Landroid/location/Location;

    return-object p1
.end method

.method static synthetic access$1200(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Landroid/view/ViewGroup;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    .prologue
    .line 45
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestPrompt:Landroid/view/ViewGroup;

    return-object v0
.end method

.method static synthetic access$1300(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->setSuccessMessage()V

    return-void
.end method

.method static synthetic access$1400(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Lcom/localytics/android/LocalyticsAmpSession;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    .prologue
    .line 45
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    return-object v0
.end method

.method static synthetic access$1500(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->setGenericErrorMessage()V

    return-void
.end method

.method static synthetic access$1600(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)V
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->doPostSuggestion()V

    return-void
.end method

.method static synthetic access$200(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Landroid/widget/EditText;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    .prologue
    .line 45
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mAddress:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic access$300(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Landroid/widget/EditText;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    .prologue
    .line 45
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mCity:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic access$400(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Landroid/widget/EditText;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    .prologue
    .line 45
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mState:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic access$500(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Landroid/widget/EditText;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    .prologue
    .line 45
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mZip:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic access$600(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Landroid/widget/EditText;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    .prologue
    .line 45
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mPlaceName:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic access$700(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Landroid/widget/EditText;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    .prologue
    .line 45
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mDescription:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic access$800(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->checkForErrors()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$900(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    .prologue
    .line 45
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestionData:Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;

    return-object v0
.end method

.method static synthetic access$902(Lcom/aetn/history/android/historyhere/view/SuggestActivity;Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;)Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/view/SuggestActivity;
    .param p1, "x1"    # Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;

    .prologue
    .line 45
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestionData:Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;

    return-object p1
.end method

.method private checkForErrors()Ljava/lang/String;
    .locals 4

    .prologue
    .line 200
    const-string v0, ""

    .line 201
    .local v0, "msg":Ljava/lang/String;
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mPlaceName:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 202
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0d0073

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 204
    :cond_0
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mState:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 205
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0d0074

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 207
    :cond_1
    return-object v0
.end method

.method private doPostSuggestion()V
    .locals 5

    .prologue
    .line 189
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/utils/ConnectionManager;->isNetworkAvailable(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 191
    new-instance v0, Lcom/aetn/history/android/historyhere/dialogs/NoInternetDialogFragment;

    invoke-direct {v0}, Lcom/aetn/history/android/historyhere/dialogs/NoInternetDialogFragment;-><init>()V

    .line 192
    .local v0, "dialog":Lcom/aetn/history/android/historyhere/dialogs/NoInternetDialogFragment;
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    const-string v2, "NoInternetDialogFragment"

    invoke-virtual {v0, v1, v2}, Lcom/aetn/history/android/historyhere/dialogs/NoInternetDialogFragment;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    .line 197
    .end local v0    # "dialog":Lcom/aetn/history/android/historyhere/dialogs/NoInternetDialogFragment;
    :goto_0
    return-void

    .line 195
    :cond_0
    new-instance v1, Lcom/aetn/history/android/historyhere/view/SuggestActivity$PostSuggestionTask;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/aetn/history/android/historyhere/view/SuggestActivity$PostSuggestionTask;-><init>(Lcom/aetn/history/android/historyhere/view/SuggestActivity;Lcom/aetn/history/android/historyhere/view/SuggestActivity$1;)V

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestionData:Lcom/aetn/history/android/historyhere/view/SuggestActivity$SuggestionData;

    aput-object v4, v2, v3

    invoke-virtual {v1, v2}, Lcom/aetn/history/android/historyhere/view/SuggestActivity$PostSuggestionTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0
.end method

.method private setErrorMessage(Ljava/lang/String;)V
    .locals 3
    .param p1, "errors"    # Ljava/lang/String;

    .prologue
    .line 211
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestPromptTitle:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0d0077

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 212
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestPromptText:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 213
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestPrompt:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 214
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mOk:Landroid/widget/Button;

    new-instance v1, Lcom/aetn/history/android/historyhere/view/SuggestActivity$3;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/view/SuggestActivity$3;-><init>(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 220
    return-void
.end method

.method private setGenericErrorMessage()V
    .locals 3

    .prologue
    .line 223
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestPromptTitle:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0d0077

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 224
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestPromptText:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0d0076

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 225
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestPrompt:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 226
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mOk:Landroid/widget/Button;

    new-instance v1, Lcom/aetn/history/android/historyhere/view/SuggestActivity$4;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/view/SuggestActivity$4;-><init>(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 232
    return-void
.end method

.method private setListeners()V
    .locals 2

    .prologue
    .line 135
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mUseLocation:Landroid/widget/Button;

    new-instance v1, Lcom/aetn/history/android/historyhere/view/SuggestActivity$1;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/view/SuggestActivity$1;-><init>(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 151
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSubmit:Landroid/widget/Button;

    new-instance v1, Lcom/aetn/history/android/historyhere/view/SuggestActivity$2;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/view/SuggestActivity$2;-><init>(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 182
    return-void
.end method

.method private setSuccessMessage()V
    .locals 3

    .prologue
    .line 235
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestPrompt:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 236
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestPromptTitle:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0d0079

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 237
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestPromptText:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0d0078

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 238
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mOk:Landroid/widget/Button;

    new-instance v1, Lcom/aetn/history/android/historyhere/view/SuggestActivity$5;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/view/SuggestActivity$5;-><init>(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 244
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/16 v4, 0x8

    .line 68
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 69
    const v3, 0x7f03004e

    invoke-virtual {p0, v3}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->setContentView(I)V

    .line 70
    iput-object p0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mContext:Landroid/content/Context;

    .line 71
    const v3, 0x7f0a00d6

    invoke-virtual {p0, v3}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    iput-object v3, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mPlaceName:Landroid/widget/EditText;

    .line 72
    const v3, 0x7f0a0064

    invoke-virtual {p0, v3}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    iput-object v3, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mAddress:Landroid/widget/EditText;

    .line 73
    const v3, 0x7f0a00d5

    invoke-virtual {p0, v3}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    iput-object v3, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mCity:Landroid/widget/EditText;

    .line 74
    const v3, 0x7f0a00d9

    invoke-virtual {p0, v3}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    iput-object v3, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mState:Landroid/widget/EditText;

    .line 75
    const v3, 0x7f0a00da

    invoke-virtual {p0, v3}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    iput-object v3, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mZip:Landroid/widget/EditText;

    .line 76
    const v3, 0x7f0a0065

    invoke-virtual {p0, v3}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    iput-object v3, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mDescription:Landroid/widget/EditText;

    .line 77
    const v3, 0x7f0a00d7

    invoke-virtual {p0, v3}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    iput-object v3, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mUseLocation:Landroid/widget/Button;

    .line 78
    const v3, 0x7f0a00db

    invoke-virtual {p0, v3}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    iput-object v3, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSubmit:Landroid/widget/Button;

    .line 79
    const v3, 0x7f0a00d8

    invoke-virtual {p0, v3}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mOr:Landroid/widget/TextView;

    .line 80
    const v3, 0x7f0a00dc

    invoke-virtual {p0, v3}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    iput-object v3, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestPrompt:Landroid/view/ViewGroup;

    .line 81
    const v3, 0x7f0a00dd

    invoke-virtual {p0, v3}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestPromptTitle:Landroid/widget/TextView;

    .line 82
    const v3, 0x7f0a00de

    invoke-virtual {p0, v3}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestPromptText:Landroid/widget/TextView;

    .line 83
    const v3, 0x7f0a0071

    invoke-virtual {p0, v3}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    iput-object v3, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mOk:Landroid/widget/Button;

    .line 85
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestPrompt:Landroid/view/ViewGroup;

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 86
    invoke-static {p0}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/LocationManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getUsersLocation()Landroid/location/Location;

    move-result-object v3

    iput-object v3, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mUsersLocation:Landroid/location/Location;

    .line 87
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mUsersLocation:Landroid/location/Location;

    if-nez v3, :cond_0

    .line 88
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mUseLocation:Landroid/widget/Button;

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setVisibility(I)V

    .line 89
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mOr:Landroid/widget/TextView;

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 94
    :cond_0
    new-instance v4, Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->getApplication()Landroid/app/Application;

    move-result-object v3

    check-cast v3, Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getLocalyticsKey()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v5, v3}, Lcom/localytics/android/LocalyticsAmpSession;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v4, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    .line 96
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    .line 97
    .local v1, "extras":Landroid/os/Bundle;
    const-string v0, ""

    .line 98
    .local v0, "calledFrom":Ljava/lang/String;
    const-string v2, ""

    .line 99
    .local v2, "tag":Ljava/lang/String;
    if-eqz v1, :cond_1

    .line 100
    const-string v3, "called_from"

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 102
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    .line 103
    const-string v3, "map"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 104
    const-string v2, "HH:Places:Suggest"

    .line 109
    :cond_2
    :goto_0
    const-string v3, "SuggestActivity"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "tag screen from: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v3}, Lcom/localytics/android/LocalyticsAmpSession;->open()V

    .line 111
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v3, v2}, Lcom/localytics/android/LocalyticsAmpSession;->tagScreen(Ljava/lang/String;)V

    .line 112
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v3}, Lcom/localytics/android/LocalyticsAmpSession;->upload()V

    .line 114
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->setListeners()V

    .line 115
    return-void

    .line 105
    :cond_3
    const-string v3, "more"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 106
    const-string v2, "HH:Suggest"

    goto :goto_0
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    if-eqz v0, :cond_0

    .line 127
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->detach()V

    .line 128
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->close()V

    .line 129
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->upload()V

    .line 131
    :cond_0
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onPause()V

    .line 132
    return-void
.end method

.method public onResume()V
    .locals 1

    .prologue
    .line 119
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onResume()V

    .line 120
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->open()V

    .line 121
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->upload()V

    .line 122
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0, p0}, Lcom/localytics/android/LocalyticsAmpSession;->attach(Landroid/support/v4/app/FragmentActivity;)V

    .line 123
    return-void
.end method
