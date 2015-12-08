.class final Lkik/android/chat/fragment/bt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lkik/android/chat/fragment/KikChangeGroupNameFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChangeGroupNameFragment;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 116
    iput-object p1, p0, Lkik/android/chat/fragment/bt;->b:Lkik/android/chat/fragment/KikChangeGroupNameFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/bt;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 3

    .prologue
    .line 116
    iget-object v0, p0, Lkik/android/chat/fragment/bt;->b:Lkik/android/chat/fragment/KikChangeGroupNameFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->c:Lkik/a/e/l;

    iget-object v1, p0, Lkik/android/chat/fragment/bt;->b:Lkik/android/chat/fragment/KikChangeGroupNameFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->b(Lkik/android/chat/fragment/KikChangeGroupNameFragment;)Lkik/a/d/n;

    move-result-object v1

    invoke-virtual {v1}, Lkik/a/d/n;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/bt;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lkik/a/e/l;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method
