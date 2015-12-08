.class final Lkik/android/chat/fragment/my;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)V
    .locals 0

    .prologue
    .line 206
    iput-object p1, p0, Lkik/android/chat/fragment/my;->a:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 206
    check-cast p2, Lkik/a/d/k;

    iget-object v0, p0, Lkik/android/chat/fragment/my;->a:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, p2, v2, v2, v1}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->a(Lkik/a/d/k;Lcom/kik/view/adapters/ContactsCursorAdapter$a;Landroid/database/Cursor;I)V

    return-void
.end method
