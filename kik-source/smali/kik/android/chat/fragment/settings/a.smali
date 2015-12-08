.class final Lkik/android/chat/fragment/settings/a;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/settings/KikPreferenceFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/settings/KikPreferenceFragment;)V
    .locals 0

    .prologue
    .line 31
    iput-object p1, p0, Lkik/android/chat/fragment/settings/a;->a:Lkik/android/chat/fragment/settings/KikPreferenceFragment;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 31
    iget-object v0, p0, Lkik/android/chat/fragment/settings/a;->a:Lkik/android/chat/fragment/settings/KikPreferenceFragment;

    new-instance v1, Lkik/android/chat/fragment/settings/b;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/settings/b;-><init>(Lkik/android/chat/fragment/settings/a;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/settings/KikPreferenceFragment;->b(Ljava/lang/Runnable;)V

    return-void
.end method
