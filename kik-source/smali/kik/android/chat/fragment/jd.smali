.class final Lkik/android/chat/fragment/jd;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikComposeFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikComposeFragment;)V
    .locals 0

    .prologue
    .line 206
    iput-object p1, p0, Lkik/android/chat/fragment/jd;->a:Lkik/android/chat/fragment/KikComposeFragment;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 210
    iget-object v0, p0, Lkik/android/chat/fragment/jd;->a:Lkik/android/chat/fragment/KikComposeFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikContactsListFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 211
    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 216
    iget-object v0, p0, Lkik/android/chat/fragment/jd;->a:Lkik/android/chat/fragment/KikComposeFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/jd;->a:Lkik/android/chat/fragment/KikComposeFragment;

    const v2, 0x7f0902db

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikComposeFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Lkik/android/util/cy;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikComposeFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    return-void
.end method
