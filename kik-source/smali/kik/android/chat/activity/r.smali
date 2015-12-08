.class final Lkik/android/chat/activity/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/activity/q;


# direct methods
.method constructor <init>(Lkik/android/chat/activity/q;)V
    .locals 0

    .prologue
    .line 302
    iput-object p1, p0, Lkik/android/chat/activity/r;->a:Lkik/android/chat/activity/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 307
    iget-object v0, p0, Lkik/android/chat/activity/r;->a:Lkik/android/chat/activity/q;

    iget-object v0, v0, Lkik/android/chat/activity/q;->b:Lkik/android/chat/activity/KikApiLandingActivity;

    invoke-virtual {v0}, Lkik/android/chat/activity/KikApiLandingActivity;->a()V

    .line 308
    return-void
.end method
