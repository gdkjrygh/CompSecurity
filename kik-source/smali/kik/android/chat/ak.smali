.class public final Lkik/android/chat/ak;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lkik/a/d/k;

.field private static b:Lkik/android/chat/fragment/KikChatFragment$b;


# direct methods
.method public static a(Lkik/a/d/k;)Lkik/android/chat/fragment/KikChatFragment$b;
    .locals 1

    .prologue
    .line 20
    if-eqz p0, :cond_0

    sget-object v0, Lkik/android/chat/ak;->a:Lkik/a/d/k;

    invoke-virtual {p0, v0}, Lkik/a/d/k;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 21
    sget-object v0, Lkik/android/chat/ak;->b:Lkik/android/chat/fragment/KikChatFragment$b;

    .line 23
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Lkik/android/chat/fragment/KikChatFragment$b;Lkik/a/d/k;)V
    .locals 0

    .prologue
    .line 14
    sput-object p0, Lkik/android/chat/ak;->b:Lkik/android/chat/fragment/KikChatFragment$b;

    .line 15
    sput-object p1, Lkik/android/chat/ak;->a:Lkik/a/d/k;

    .line 16
    return-void
.end method
