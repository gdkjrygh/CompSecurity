.class final Lkik/android/chat/fragment/oe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/od;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/od;)V
    .locals 0

    .prologue
    .line 70
    iput-object p1, p0, Lkik/android/chat/fragment/oe;->a:Lkik/android/chat/fragment/od;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lkik/android/chat/fragment/oe;->a:Lkik/android/chat/fragment/od;

    iget-object v0, v0, Lkik/android/chat/fragment/od;->a:Lkik/android/chat/fragment/KikPromotedChatsFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->_contactsList:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->invalidateViews()V

    .line 75
    return-void
.end method
