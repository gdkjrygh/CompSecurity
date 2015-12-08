.class final Lkik/android/chat/fragment/nr;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikPreferenceLaunchpad;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikPreferenceLaunchpad;)V
    .locals 0

    .prologue
    .line 83
    iput-object p1, p0, Lkik/android/chat/fragment/nr;->a:Lkik/android/chat/fragment/KikPreferenceLaunchpad;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 83
    iget-object v0, p0, Lkik/android/chat/fragment/nr;->a:Lkik/android/chat/fragment/KikPreferenceLaunchpad;

    new-instance v1, Lkik/android/chat/fragment/ns;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/ns;-><init>(Lkik/android/chat/fragment/nr;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikPreferenceLaunchpad;->b(Ljava/lang/Runnable;)V

    return-void
.end method
