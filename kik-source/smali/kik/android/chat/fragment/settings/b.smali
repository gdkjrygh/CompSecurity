.class final Lkik/android/chat/fragment/settings/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/settings/a;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/settings/a;)V
    .locals 0

    .prologue
    .line 35
    iput-object p1, p0, Lkik/android/chat/fragment/settings/b;->a:Lkik/android/chat/fragment/settings/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lkik/android/chat/fragment/settings/b;->a:Lkik/android/chat/fragment/settings/a;

    iget-object v0, v0, Lkik/android/chat/fragment/settings/a;->a:Lkik/android/chat/fragment/settings/KikPreferenceFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/settings/KikPreferenceFragment;->a(Lkik/android/chat/fragment/settings/KikPreferenceFragment;)V

    .line 40
    return-void
.end method
