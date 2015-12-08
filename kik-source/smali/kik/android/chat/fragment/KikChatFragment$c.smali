.class final Lkik/android/chat/fragment/KikChatFragment$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/chat/fragment/KikChatFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "c"
.end annotation


# static fields
.field public static final enum a:I

.field public static final enum b:I

.field public static final enum c:I

.field private static final synthetic d:[I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v0, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    .line 269
    sput v3, Lkik/android/chat/fragment/KikChatFragment$c;->a:I

    sput v4, Lkik/android/chat/fragment/KikChatFragment$c;->b:I

    sput v0, Lkik/android/chat/fragment/KikChatFragment$c;->c:I

    .line 268
    new-array v0, v0, [I

    const/4 v1, 0x0

    sget v2, Lkik/android/chat/fragment/KikChatFragment$c;->a:I

    aput v2, v0, v1

    sget v1, Lkik/android/chat/fragment/KikChatFragment$c;->b:I

    aput v1, v0, v3

    sget v1, Lkik/android/chat/fragment/KikChatFragment$c;->c:I

    aput v1, v0, v4

    sput-object v0, Lkik/android/chat/fragment/KikChatFragment$c;->d:[I

    return-void
.end method
