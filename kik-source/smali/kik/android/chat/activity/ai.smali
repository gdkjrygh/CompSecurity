.class final Lkik/android/chat/activity/ai;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/activity/KikIqActivityBase;


# direct methods
.method constructor <init>(Lkik/android/chat/activity/KikIqActivityBase;)V
    .locals 0

    .prologue
    .line 140
    iput-object p1, p0, Lkik/android/chat/activity/ai;->a:Lkik/android/chat/activity/KikIqActivityBase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 144
    iget-object v0, p0, Lkik/android/chat/activity/ai;->a:Lkik/android/chat/activity/KikIqActivityBase;

    iget-object v1, p0, Lkik/android/chat/activity/ai;->a:Lkik/android/chat/activity/KikIqActivityBase;

    iget-object v1, v1, Lkik/android/chat/activity/KikIqActivityBase;->h:Ljava/lang/String;

    iget-object v2, p0, Lkik/android/chat/activity/ai;->a:Lkik/android/chat/activity/KikIqActivityBase;

    iget-object v2, v2, Lkik/android/chat/activity/KikIqActivityBase;->i:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lkik/android/chat/activity/KikIqActivityBase;->a(Lkik/android/chat/activity/KikIqActivityBase;Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    return-void
.end method
