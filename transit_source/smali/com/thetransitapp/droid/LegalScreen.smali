.class public Lcom/thetransitapp/droid/LegalScreen;
.super Lcom/thetransitapp/droid/BaseMapScreen;
.source "LegalScreen.java"

# interfaces
.implements Lcom/thetransitapp/droid/service/ServiceCallback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/thetransitapp/droid/BaseMapScreen;",
        "Lcom/thetransitapp/droid/service/ServiceCallback",
        "<",
        "Ljava/util/List",
        "<",
        "Lcom/thetransitapp/droid/model/Feed;",
        ">;>;"
    }
.end annotation


# instance fields
.field private adapter:Lcom/thetransitapp/droid/widget/LegalAdapter;

.field private legalItems:Landroid/widget/ListView;
    .annotation runtime Lroboguice/inject/InjectView;
        value = 0x7f05008a
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 26
    sget-object v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->LEGAL_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-direct {p0, v0}, Lcom/thetransitapp/droid/BaseMapScreen;-><init>(Lcom/thetransitapp/droid/TransitActivity$TransitScreen;)V

    .line 27
    return-void
.end method


# virtual methods
.method public onError(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0
    .param p1, "message"    # Ljava/lang/String;
    .param p2, "exception"    # Ljava/lang/Exception;

    .prologue
    .line 67
    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/thetransitapp/droid/LegalScreen;->onResult(Ljava/util/List;)V

    return-void
.end method

.method public onResult(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/thetransitapp/droid/model/Feed;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 51
    .local p1, "result":Ljava/util/List;, "Ljava/util/List<Lcom/thetransitapp/droid/model/Feed;>;"
    iget-object v1, p0, Lcom/thetransitapp/droid/LegalScreen;->adapter:Lcom/thetransitapp/droid/widget/LegalAdapter;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/widget/LegalAdapter;->clear()V

    .line 52
    iget-object v1, p0, Lcom/thetransitapp/droid/LegalScreen;->adapter:Lcom/thetransitapp/droid/widget/LegalAdapter;

    invoke-virtual {v1, p1}, Lcom/thetransitapp/droid/widget/LegalAdapter;->addAll(Ljava/util/Collection;)V

    .line 54
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v1

    if-nez v1, :cond_0

    .line 55
    new-instance v0, Lcom/thetransitapp/droid/model/Feed;

    invoke-direct {v0}, Lcom/thetransitapp/droid/model/Feed;-><init>()V

    .line 56
    .local v0, "feed":Lcom/thetransitapp/droid/model/Feed;
    const-string v1, "Google Play Services"

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/model/Feed;->setName(Ljava/lang/String;)V

    .line 57
    const-string v1, "play"

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/model/Feed;->setCode(Ljava/lang/String;)V

    .line 58
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const v2, 0x7f0a008f

    invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/model/Feed;->setLicence(Ljava/lang/String;)V

    .line 60
    iget-object v1, p0, Lcom/thetransitapp/droid/LegalScreen;->adapter:Lcom/thetransitapp/droid/widget/LegalAdapter;

    invoke-virtual {v1, v0}, Lcom/thetransitapp/droid/widget/LegalAdapter;->add(Ljava/lang/Object;)V

    .line 62
    .end local v0    # "feed":Lcom/thetransitapp/droid/model/Feed;
    :cond_0
    return-void
.end method

.method public onStart()V
    .locals 3

    .prologue
    .line 40
    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->onStart()V

    .line 42
    invoke-virtual {p0}, Lcom/thetransitapp/droid/LegalScreen;->getLastLocation()Landroid/location/Location;

    move-result-object v0

    .line 44
    .local v0, "location":Landroid/location/Location;
    if-eqz v0, :cond_0

    .line 45
    new-instance v1, Lcom/thetransitapp/droid/service/LegalNoticeTask;

    invoke-virtual {p0}, Lcom/thetransitapp/droid/LegalScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v1, v2, v0, p0}, Lcom/thetransitapp/droid/service/LegalNoticeTask;-><init>(Landroid/content/Context;Landroid/location/Location;Lcom/thetransitapp/droid/service/ServiceCallback;)V

    invoke-virtual {v1}, Lcom/thetransitapp/droid/service/LegalNoticeTask;->execute()V

    .line 47
    :cond_0
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2
    .param p1, "view"    # Landroid/view/View;
    .param p2, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 31
    invoke-super {p0, p1, p2}, Lcom/thetransitapp/droid/BaseMapScreen;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 33
    new-instance v0, Lcom/thetransitapp/droid/widget/LegalAdapter;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/thetransitapp/droid/widget/LegalAdapter;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/thetransitapp/droid/LegalScreen;->adapter:Lcom/thetransitapp/droid/widget/LegalAdapter;

    .line 34
    iget-object v0, p0, Lcom/thetransitapp/droid/LegalScreen;->adapter:Lcom/thetransitapp/droid/widget/LegalAdapter;

    invoke-super {p0}, Lcom/thetransitapp/droid/BaseMapScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/thetransitapp/droid/widget/LegalAdapter;->setActivity(Landroid/app/Activity;)V

    .line 35
    iget-object v0, p0, Lcom/thetransitapp/droid/LegalScreen;->legalItems:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/thetransitapp/droid/LegalScreen;->adapter:Lcom/thetransitapp/droid/widget/LegalAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 36
    return-void
.end method
