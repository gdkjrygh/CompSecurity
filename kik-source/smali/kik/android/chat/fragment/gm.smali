.class final Lkik/android/chat/fragment/gm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/gl;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/gl;)V
    .locals 0

    .prologue
    .line 813
    iput-object p1, p0, Lkik/android/chat/fragment/gm;->a:Lkik/android/chat/fragment/gl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 817
    iget-object v0, p0, Lkik/android/chat/fragment/gm;->a:Lkik/android/chat/fragment/gl;

    iget-object v0, v0, Lkik/android/chat/fragment/gl;->a:Lkik/android/chat/fragment/KikChatInfoFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatInfoFragment;->m(Lkik/android/chat/fragment/KikChatInfoFragment;)V

    .line 818
    return-void
.end method
