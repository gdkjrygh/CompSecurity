.class final Lkik/android/chat/fragment/bm;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikCardBrowserFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikCardBrowserFragment;)V
    .locals 0

    .prologue
    .line 95
    iput-object p1, p0, Lkik/android/chat/fragment/bm;->a:Lkik/android/chat/fragment/KikCardBrowserFragment;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 95
    check-cast p2, Landroid/os/Message;

    sput-object p2, Lkik/android/chat/fragment/KikCardBrowserFragment;->y:Landroid/os/Message;

    iget-object v0, p0, Lkik/android/chat/fragment/bm;->a:Lkik/android/chat/fragment/KikCardBrowserFragment;

    new-instance v1, Lkik/android/chat/fragment/KikCardBrowserFragment$a;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikCardBrowserFragment$a;-><init>()V

    iget-object v2, p0, Lkik/android/chat/fragment/bm;->a:Lkik/android/chat/fragment/KikCardBrowserFragment;

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikCardBrowserFragment;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikCardBrowserFragment$a;->c(Ljava/lang/String;)Lcom/kik/cards/web/CardsWebViewFragment$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikCardBrowserFragment;->a(Lkik/android/util/an;)Lcom/kik/g/p;

    return-void
.end method
