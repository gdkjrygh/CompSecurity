.class final Lkik/android/chat/fragment/nv;
.super Lkik/android/util/bf;
.source "SourceFile"


# instance fields
.field final synthetic a:[B

.field final synthetic b:Lkik/android/chat/fragment/KikPreferenceLaunchpad;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikPreferenceLaunchpad;[B)V
    .locals 0

    .prologue
    .line 243
    iput-object p1, p0, Lkik/android/chat/fragment/nv;->b:Lkik/android/chat/fragment/KikPreferenceLaunchpad;

    iput-object p2, p0, Lkik/android/chat/fragment/nv;->a:[B

    invoke-direct {p0}, Lkik/android/util/bf;-><init>()V

    return-void
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 243
    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/nv;->b:Lkik/android/chat/fragment/KikPreferenceLaunchpad;

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/nv;->a:[B

    invoke-virtual {v0, v1, v2}, Lkik/android/util/p;->a(Landroid/app/Activity;[B)Z

    const/4 v0, 0x0

    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 243
    iget-object v0, p0, Lkik/android/chat/fragment/nv;->b:Lkik/android/chat/fragment/KikPreferenceLaunchpad;

    iget-object v0, v0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/ProgressDialogFragment;->dismiss()V

    iget-object v0, p0, Lkik/android/chat/fragment/nv;->b:Lkik/android/chat/fragment/KikPreferenceLaunchpad;

    const/4 v1, 0x0

    iput-object v1, v0, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->a:Lkik/android/chat/fragment/ProgressDialogFragment;

    return-void
.end method
