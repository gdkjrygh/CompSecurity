.class Lcom/facebook/orca/contacts/favorites/x;
.super Ljava/lang/Object;
.source "FavoriteGroupItemView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/favorites/w;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/favorites/w;)V
    .locals 0

    .prologue
    .line 80
    iput-object p1, p0, Lcom/facebook/orca/contacts/favorites/x;->a:Lcom/facebook/orca/contacts/favorites/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/x;->a:Lcom/facebook/orca/contacts/favorites/w;

    invoke-static {v0}, Lcom/facebook/orca/contacts/favorites/w;->a(Lcom/facebook/orca/contacts/favorites/w;)Lcom/facebook/orca/contacts/favorites/y;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/favorites/y;->b()V

    .line 85
    return-void
.end method
