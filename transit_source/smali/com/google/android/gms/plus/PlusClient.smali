.class public Lcom/google/android/gms/plus/PlusClient;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/GooglePlayServicesClient;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/plus/PlusClient$Builder;,
        Lcom/google/android/gms/plus/PlusClient$OnAccessRevokedListener;,
        Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;,
        Lcom/google/android/gms/plus/PlusClient$OrderBy;,
        Lcom/google/android/gms/plus/PlusClient$OnMomentsLoadedListener;
    }
.end annotation


# instance fields
.field final rb:Lcom/google/android/gms/internal/fl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/fl;)V
    .locals 0
    .param p1, "plusClientImpl"    # Lcom/google/android/gms/internal/fl;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/plus/PlusClient;->rb:Lcom/google/android/gms/internal/fl;

    return-void
.end method


# virtual methods
.method cR()Lcom/google/android/gms/internal/fl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->rb:Lcom/google/android/gms/internal/fl;

    return-object v0
.end method

.method public clearDefaultAccount()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->rb:Lcom/google/android/gms/internal/fl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fl;->clearDefaultAccount()V

    return-void
.end method

.method public connect()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->rb:Lcom/google/android/gms/internal/fl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fl;->connect()V

    return-void
.end method

.method public disconnect()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->rb:Lcom/google/android/gms/internal/fl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fl;->disconnect()V

    return-void
.end method

.method public getAccountName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->rb:Lcom/google/android/gms/internal/fl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fl;->getAccountName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCurrentPerson()Lcom/google/android/gms/plus/model/people/Person;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->rb:Lcom/google/android/gms/internal/fl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fl;->getCurrentPerson()Lcom/google/android/gms/plus/model/people/Person;

    move-result-object v0

    return-object v0
.end method

.method public isConnected()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->rb:Lcom/google/android/gms/internal/fl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fl;->isConnected()Z

    move-result v0

    return v0
.end method

.method public isConnecting()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->rb:Lcom/google/android/gms/internal/fl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fl;->isConnecting()Z

    move-result v0

    return v0
.end method

.method public isConnectionCallbacksRegistered(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)Z
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->rb:Lcom/google/android/gms/internal/fl;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/fl;->isConnectionCallbacksRegistered(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)Z

    move-result v0

    return v0
.end method

.method public isConnectionFailedListenerRegistered(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)Z
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->rb:Lcom/google/android/gms/internal/fl;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/fl;->isConnectionFailedListenerRegistered(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)Z

    move-result v0

    return v0
.end method

.method public loadMoments(Lcom/google/android/gms/plus/PlusClient$OnMomentsLoadedListener;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/plus/PlusClient$OnMomentsLoadedListener;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->rb:Lcom/google/android/gms/internal/fl;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/fl;->loadMoments(Lcom/google/android/gms/plus/PlusClient$OnMomentsLoadedListener;)V

    return-void
.end method

.method public loadMoments(Lcom/google/android/gms/plus/PlusClient$OnMomentsLoadedListener;ILjava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7
    .param p1, "listener"    # Lcom/google/android/gms/plus/PlusClient$OnMomentsLoadedListener;
    .param p2, "maxResults"    # I
    .param p3, "pageToken"    # Ljava/lang/String;
    .param p4, "targetUrl"    # Landroid/net/Uri;
    .param p5, "type"    # Ljava/lang/String;
    .param p6, "userId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->rb:Lcom/google/android/gms/internal/fl;

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/fl;->loadMoments(Lcom/google/android/gms/plus/PlusClient$OnMomentsLoadedListener;ILjava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public loadPeople(Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;Ljava/util/Collection;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p2, "personIds":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->rb:Lcom/google/android/gms/internal/fl;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/fl;->a(Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;Ljava/util/Collection;)V

    return-void
.end method

.method public varargs loadPeople(Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;[Ljava/lang/String;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;
    .param p2, "personIds"    # [Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->rb:Lcom/google/android/gms/internal/fl;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/fl;->a(Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;[Ljava/lang/String;)V

    return-void
.end method

.method public loadVisiblePeople(Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;ILjava/lang/String;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;
    .param p2, "orderBy"    # I
    .param p3, "pageToken"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->rb:Lcom/google/android/gms/internal/fl;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/fl;->loadVisiblePeople(Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;ILjava/lang/String;)V

    return-void
.end method

.method public loadVisiblePeople(Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;Ljava/lang/String;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;
    .param p2, "pageToken"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->rb:Lcom/google/android/gms/internal/fl;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/fl;->loadVisiblePeople(Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;Ljava/lang/String;)V

    return-void
.end method

.method public registerConnectionCallbacks(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->rb:Lcom/google/android/gms/internal/fl;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/fl;->registerConnectionCallbacks(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V

    return-void
.end method

.method public registerConnectionFailedListener(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->rb:Lcom/google/android/gms/internal/fl;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/fl;->registerConnectionFailedListener(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V

    return-void
.end method

.method public removeMoment(Ljava/lang/String;)V
    .locals 1
    .param p1, "momentId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->rb:Lcom/google/android/gms/internal/fl;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/fl;->removeMoment(Ljava/lang/String;)V

    return-void
.end method

.method public revokeAccessAndDisconnect(Lcom/google/android/gms/plus/PlusClient$OnAccessRevokedListener;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/plus/PlusClient$OnAccessRevokedListener;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->rb:Lcom/google/android/gms/internal/fl;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/fl;->revokeAccessAndDisconnect(Lcom/google/android/gms/plus/PlusClient$OnAccessRevokedListener;)V

    return-void
.end method

.method public unregisterConnectionCallbacks(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->rb:Lcom/google/android/gms/internal/fl;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/fl;->unregisterConnectionCallbacks(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V

    return-void
.end method

.method public unregisterConnectionFailedListener(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->rb:Lcom/google/android/gms/internal/fl;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/fl;->unregisterConnectionFailedListener(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V

    return-void
.end method

.method public writeMoment(Lcom/google/android/gms/plus/model/moments/Moment;)V
    .locals 1
    .param p1, "moment"    # Lcom/google/android/gms/plus/model/moments/Moment;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->rb:Lcom/google/android/gms/internal/fl;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/fl;->writeMoment(Lcom/google/android/gms/plus/model/moments/Moment;)V

    return-void
.end method
