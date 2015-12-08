.class final Lkik/android/chat/fragment/mv;
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
    .line 798
    iput-object p1, p0, Lkik/android/chat/fragment/mv;->b:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/mv;->a:Lkik/a/d/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 803
    iget-object v0, p0, Lkik/android/chat/fragment/mv;->b:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->e(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)Lkik/android/widget/KikContactImageThumbNailList;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/mv;->a:Lkik/a/d/k;

    invoke-virtual {v0, v1}, Lkik/android/widget/KikContactImageThumbNailList;->a(Lkik/a/d/k;)Lcom/kik/g/aq;

    .line 804
    iget-object v0, p0, Lkik/android/chat/fragment/mv;->b:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/mv;->a:Lkik/a/d/k;

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->c(Lkik/a/d/k;)V

    .line 805
    return-void
.end method
