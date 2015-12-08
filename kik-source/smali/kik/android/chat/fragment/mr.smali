.class final Lkik/android/chat/fragment/mr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/a/d/k;

.field final synthetic b:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;Lkik/a/d/k;)V
    .locals 0

    .prologue
    .line 739
    iput-object p1, p0, Lkik/android/chat/fragment/mr;->b:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/mr;->a:Lkik/a/d/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 744
    iget-object v0, p0, Lkik/android/chat/fragment/mr;->b:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->e(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)Lkik/android/widget/KikContactImageThumbNailList;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/mr;->a:Lkik/a/d/k;

    iget-object v2, p0, Lkik/android/chat/fragment/mr;->b:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->H:Lkik/a/e/r;

    invoke-virtual {v0, v1, v2}, Lkik/android/widget/KikContactImageThumbNailList;->a(Lkik/a/d/k;Lkik/a/e/r;)V

    .line 745
    iget-object v0, p0, Lkik/android/chat/fragment/mr;->b:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/mr;->a:Lkik/a/d/k;

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->b(Lkik/a/d/k;)V

    .line 746
    return-void
.end method
