.class final Lkik/android/chat/fragment/mb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/a/f/f/z;

.field final synthetic b:Lkik/android/chat/fragment/KikIqFragmentBase;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikIqFragmentBase;Lkik/a/f/f/z;)V
    .locals 0

    .prologue
    .line 194
    iput-object p1, p0, Lkik/android/chat/fragment/mb;->b:Lkik/android/chat/fragment/KikIqFragmentBase;

    iput-object p2, p0, Lkik/android/chat/fragment/mb;->a:Lkik/a/f/f/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 198
    iget-object v1, p0, Lkik/android/chat/fragment/mb;->b:Lkik/android/chat/fragment/KikIqFragmentBase;

    iget-object v0, p0, Lkik/android/chat/fragment/mb;->b:Lkik/android/chat/fragment/KikIqFragmentBase;

    iget v2, v0, Lkik/android/chat/fragment/KikIqFragmentBase;->R:I

    iget-object v0, p0, Lkik/android/chat/fragment/mb;->a:Lkik/a/f/f/z;

    invoke-virtual {v0}, Lkik/a/f/f/z;->m()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lkik/android/chat/fragment/KikIqFragmentBase;->a(ILjava/lang/String;)V

    .line 199
    return-void
.end method
