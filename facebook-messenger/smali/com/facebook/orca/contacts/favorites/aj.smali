.class public Lcom/facebook/orca/contacts/favorites/aj;
.super Lcom/facebook/widget/f;
.source "NoFavoriteContactsItemView.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0, p1}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;)V

    .line 18
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/favorites/aj;->a(Landroid/content/Context;)V

    .line 19
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 32
    sget v0, Lcom/facebook/k;->orca_no_favorites_row:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/favorites/aj;->setContentView(I)V

    .line 33
    return-void
.end method
