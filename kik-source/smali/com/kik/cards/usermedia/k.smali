.class public final Lcom/kik/cards/usermedia/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/cards/web/usermedia/c;


# instance fields
.field private a:Lcom/kik/cards/web/CardsWebViewFragment;


# direct methods
.method public constructor <init>(Lcom/kik/cards/web/CardsWebViewFragment;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/kik/cards/usermedia/k;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    .line 28
    return-void
.end method

.method static synthetic a(Lcom/kik/cards/usermedia/k;)Lcom/kik/cards/web/CardsWebViewFragment;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/kik/cards/usermedia/k;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    return-object v0
.end method


# virtual methods
.method public final a(IIZ)Lcom/kik/g/p;
    .locals 5

    .prologue
    const/4 v0, 0x1

    .line 39
    new-instance v2, Lcom/kik/g/p;

    invoke-direct {v2}, Lcom/kik/g/p;-><init>()V

    .line 42
    if-ne p1, v0, :cond_0

    .line 43
    new-instance v1, Landroid/content/Intent;

    const-string v3, "android.intent.action.GET_CONTENT"

    sget-object v4, Landroid/provider/MediaStore$Images$Media;->INTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-direct {v1, v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const-string v3, "image/*"

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 52
    :goto_0
    iget-object v3, p0, Lcom/kik/cards/usermedia/k;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-virtual {v3, v1}, Lcom/kik/cards/web/CardsWebViewFragment;->a(Landroid/content/Intent;)Lcom/kik/g/p;

    move-result-object v1

    new-instance v3, Lcom/kik/cards/usermedia/l;

    invoke-direct {v3, p0, v0, v2}, Lcom/kik/cards/usermedia/l;-><init>(Lcom/kik/cards/usermedia/k;ZLcom/kik/g/p;)V

    invoke-virtual {v1, v3}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 93
    return-object v2

    .line 47
    :cond_0
    const/4 v0, 0x0

    .line 48
    new-instance v1, Landroid/content/Intent;

    iget-object v3, p0, Lcom/kik/cards/usermedia/k;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-virtual {v3}, Lcom/kik/cards/web/CardsWebViewFragment;->t()Landroid/content/Context;

    move-result-object v3

    const-class v4, Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-direct {v1, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v3, "extra.maxselections"

    invoke-virtual {v1, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v3, "extra.minselections"

    invoke-virtual {v1, v3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    goto :goto_0
.end method
