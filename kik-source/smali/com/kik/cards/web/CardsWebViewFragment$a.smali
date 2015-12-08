.class public abstract Lcom/kik/cards/web/CardsWebViewFragment$a;
.super Lcom/kik/ui/fragment/FragmentBase$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/cards/web/CardsWebViewFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 1984
    invoke-direct {p0}, Lcom/kik/ui/fragment/FragmentBase$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kik/cards/web/kik/KikContentMessageParcelable;)Lcom/kik/cards/web/CardsWebViewFragment$a;
    .locals 1

    .prologue
    .line 2077
    const-string v0, "CardsWebViewFragment.EXTRA_CONTENT_MESSAGE"

    invoke-virtual {p0, v0, p1}, Lcom/kik/cards/web/CardsWebViewFragment$a;->a(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 2078
    return-object p0
.end method

.method public final a(Lcom/kik/cards/web/picker/PickerRequest;)Lcom/kik/cards/web/CardsWebViewFragment$a;
    .locals 1

    .prologue
    .line 2033
    const-string v0, "CardsWebViewFragment.EXTRA_PICKER_REQUEST"

    invoke-virtual {p0, v0, p1}, Lcom/kik/cards/web/CardsWebViewFragment$a;->a(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 2034
    return-object p0
.end method

.method public final a(Ljava/lang/String;)Lcom/kik/cards/web/CardsWebViewFragment$a;
    .locals 2

    .prologue
    .line 1994
    if-nez p1, :cond_0

    .line 2001
    :goto_0
    return-object p0

    .line 1997
    :cond_0
    const-string v0, "card"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1998
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "http"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x4

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 2000
    :cond_1
    const-string v0, "CardsWebViewFragment.EXTRA_URL_KEY"

    invoke-virtual {p0, v0, p1}, Lcom/kik/cards/web/CardsWebViewFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 2006
    const-string v0, "CardsWebViewFragment.EXTRA_URL_KEY"

    invoke-virtual {p0, v0}, Lcom/kik/cards/web/CardsWebViewFragment$a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/String;)Lcom/kik/cards/web/CardsWebViewFragment$a;
    .locals 1

    .prologue
    .line 2011
    const-string v0, "CardsWebViewFragment.EXTRA_TAG_KEY"

    invoke-virtual {p0, v0, p1}, Lcom/kik/cards/web/CardsWebViewFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2012
    return-object p0
.end method

.method protected final b()Ljava/lang/Boolean;
    .locals 1

    .prologue
    .line 2028
    const-string v0, "CardsWebViewFragment.EXTRA_CLEAR_CACHE_KEY"

    invoke-virtual {p0, v0}, Lcom/kik/cards/web/CardsWebViewFragment$a;->f(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public final c(Ljava/lang/String;)Lcom/kik/cards/web/CardsWebViewFragment$a;
    .locals 1

    .prologue
    .line 2055
    const-string v0, "CardsWebViewFragment.EXTRA_REFERER_URL"

    invoke-virtual {p0, v0, p1}, Lcom/kik/cards/web/CardsWebViewFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2056
    return-object p0
.end method

.method protected final c()Lcom/kik/cards/web/picker/PickerRequest;
    .locals 1

    .prologue
    .line 2039
    const-string v0, "CardsWebViewFragment.EXTRA_PICKER_REQUEST"

    invoke-virtual {p0, v0}, Lcom/kik/cards/web/CardsWebViewFragment$a;->l(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/kik/cards/web/picker/PickerRequest;

    return-object v0
.end method

.method public final d(Ljava/lang/String;)Lcom/kik/cards/web/CardsWebViewFragment$a;
    .locals 1

    .prologue
    .line 2066
    const-string v0, "CardsWebViewFragment.EXTRA_CONVO_ID"

    invoke-virtual {p0, v0, p1}, Lcom/kik/cards/web/CardsWebViewFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2067
    return-object p0
.end method

.method protected final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 2061
    const-string v0, "CardsWebViewFragment.EXTRA_REFERER_URL"

    invoke-virtual {p0, v0}, Lcom/kik/cards/web/CardsWebViewFragment$a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 2072
    const-string v0, "CardsWebViewFragment.EXTRA_CONVO_ID"

    invoke-virtual {p0, v0}, Lcom/kik/cards/web/CardsWebViewFragment$a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final f()Lcom/kik/cards/web/kik/KikContentMessageParcelable;
    .locals 1

    .prologue
    .line 2083
    const-string v0, "CardsWebViewFragment.EXTRA_CONTENT_MESSAGE"

    invoke-virtual {p0, v0}, Lcom/kik/cards/web/CardsWebViewFragment$a;->l(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/kik/cards/web/kik/KikContentMessageParcelable;

    return-object v0
.end method

.method public final g()Lcom/kik/cards/web/CardsWebViewFragment$a;
    .locals 2

    .prologue
    .line 2088
    const-string v0, "CardsWebViewFragment.FROM_MEDIA_TRAY"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/kik/cards/web/CardsWebViewFragment$a;->a(Ljava/lang/String;Z)V

    .line 2089
    return-object p0
.end method
