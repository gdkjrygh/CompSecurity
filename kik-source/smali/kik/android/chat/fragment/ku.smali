.class final Lkik/android/chat/fragment/ku;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikDefaultContactsListFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikDefaultContactsListFragment;)V
    .locals 0

    .prologue
    .line 137
    iput-object p1, p0, Lkik/android/chat/fragment/ku;->a:Lkik/android/chat/fragment/KikDefaultContactsListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 142
    iget-object v0, p0, Lkik/android/chat/fragment/ku;->a:Lkik/android/chat/fragment/KikDefaultContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->g:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 144
    iget-object v0, p0, Lkik/android/chat/fragment/ku;->a:Lkik/android/chat/fragment/KikDefaultContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->o:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 145
    iget-object v0, p0, Lkik/android/chat/fragment/ku;->a:Lkik/android/chat/fragment/KikDefaultContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->o:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 147
    iget-object v0, p0, Lkik/android/chat/fragment/ku;->a:Lkik/android/chat/fragment/KikDefaultContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->k:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 149
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 150
    iget-object v1, p0, Lkik/android/chat/fragment/ku;->a:Lkik/android/chat/fragment/KikDefaultContactsListFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->x:Lkik/android/sdkutils/concurrent/c;

    invoke-virtual {v1, v0}, Lkik/android/sdkutils/concurrent/c;->a(Ljava/lang/Object;)V

    .line 151
    iget-object v0, p0, Lkik/android/chat/fragment/ku;->a:Lkik/android/chat/fragment/KikDefaultContactsListFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->x:Lkik/android/sdkutils/concurrent/c;

    invoke-virtual {v0}, Lkik/android/sdkutils/concurrent/c;->a()Lcom/kik/g/p;

    .line 152
    iget-object v0, p0, Lkik/android/chat/fragment/ku;->a:Lkik/android/chat/fragment/KikDefaultContactsListFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->z()V

    .line 153
    return-void
.end method
