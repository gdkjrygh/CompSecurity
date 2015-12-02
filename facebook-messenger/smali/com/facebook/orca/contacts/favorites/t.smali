.class Lcom/facebook/orca/contacts/favorites/t;
.super Ljava/lang/Object;
.source "FavoriteContactItemView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/favorites/s;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/favorites/s;)V
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lcom/facebook/orca/contacts/favorites/t;->a:Lcom/facebook/orca/contacts/favorites/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/t;->a:Lcom/facebook/orca/contacts/favorites/s;

    invoke-static {v0}, Lcom/facebook/orca/contacts/favorites/s;->a(Lcom/facebook/orca/contacts/favorites/s;)Lcom/facebook/orca/contacts/favorites/u;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/favorites/u;->b()V

    .line 69
    return-void
.end method
