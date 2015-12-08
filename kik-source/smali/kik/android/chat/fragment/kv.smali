.class final Lkik/android/chat/fragment/kv;
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
    .line 156
    iput-object p1, p0, Lkik/android/chat/fragment/kv;->a:Lkik/android/chat/fragment/KikDefaultContactsListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 161
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    .line 163
    iget-object v1, p0, Lkik/android/chat/fragment/kv;->a:Lkik/android/chat/fragment/KikDefaultContactsListFragment;

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikDefaultContactsListFragment;->a(Lkik/a/d/k;)V

    .line 164
    return-void
.end method
