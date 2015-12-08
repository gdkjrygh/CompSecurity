.class Lcom/aetn/history/android/historyhere/view/SuggestActivity$1;
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
    .line 135
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$1;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 140
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$1;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mContext:Landroid/content/Context;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$000(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/LocationManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getUsersAddress()Landroid/location/Address;

    move-result-object v0

    .line 141
    .local v0, "a":Landroid/location/Address;
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$1;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$1;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mContext:Landroid/content/Context;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$000(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/LocationManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/LocationManager;->getUsersLocation()Landroid/location/Location;

    move-result-object v2

    # setter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mLocation:Landroid/location/Location;
    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$102(Lcom/aetn/history/android/historyhere/view/SuggestActivity;Landroid/location/Location;)Landroid/location/Location;

    .line 142
    if-eqz v0, :cond_0

    .line 143
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$1;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mAddress:Landroid/widget/EditText;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$200(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Landroid/widget/EditText;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/location/Address;->getAddressLine(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 144
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$1;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mCity:Landroid/widget/EditText;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$300(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v0}, Landroid/location/Address;->getLocality()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 145
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$1;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mState:Landroid/widget/EditText;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$400(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v0}, Landroid/location/Address;->getAdminArea()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 146
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$1;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mZip:Landroid/widget/EditText;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$500(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v0}, Landroid/location/Address;->getPostalCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 148
    :cond_0
    return-void
.end method
