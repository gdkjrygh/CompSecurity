.class Lcom/facebook/contacts/contactcard/ak;
.super Ljava/lang/Object;
.source "GroupMembersSectionView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/contacts/contactcard/GroupMembersSectionView;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/contactcard/GroupMembersSectionView;)V
    .locals 0

    .prologue
    .line 80
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/ak;->a:Lcom/facebook/contacts/contactcard/GroupMembersSectionView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 83
    check-cast p1, Lcom/facebook/contacts/contactcard/aw;

    .line 84
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ak;->a:Lcom/facebook/contacts/contactcard/GroupMembersSectionView;

    invoke-virtual {p1}, Lcom/facebook/contacts/contactcard/aw;->getParticipant()Lcom/facebook/orca/threads/ThreadParticipant;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/contacts/contactcard/GroupMembersSectionView;->a(Lcom/facebook/contacts/contactcard/GroupMembersSectionView;Lcom/facebook/orca/threads/ThreadParticipant;)V

    .line 85
    return-void
.end method
