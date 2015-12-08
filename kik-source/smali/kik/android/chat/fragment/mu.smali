.class final Lkik/android/chat/fragment/mu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 786
    iput-object p1, p0, Lkik/android/chat/fragment/mu;->b:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/mu;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 791
    iget-object v0, p0, Lkik/android/chat/fragment/mu;->b:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->e(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)Lkik/android/widget/KikContactImageThumbNailList;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/mu;->a:Ljava/lang/String;

    iget-object v2, p0, Lkik/android/chat/fragment/mu;->b:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->H:Lkik/a/e/r;

    invoke-virtual {v0, v1, v2}, Lkik/android/widget/KikContactImageThumbNailList;->a(Ljava/lang/String;Lkik/a/e/r;)V

    .line 792
    return-void
.end method
