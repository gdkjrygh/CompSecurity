.class public final Lcom/c/b/bu$c$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/bu$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field public static final enum a:I

.field public static final enum b:I

.field private static final synthetic c:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v0, 0x2

    const/4 v3, 0x1

    .line 1187
    sput v3, Lcom/c/b/bu$c$b;->a:I

    .line 1189
    sput v0, Lcom/c/b/bu$c$b;->b:I

    .line 1185
    new-array v0, v0, [I

    const/4 v1, 0x0

    sget v2, Lcom/c/b/bu$c$b;->a:I

    aput v2, v0, v1

    sget v1, Lcom/c/b/bu$c$b;->b:I

    aput v1, v0, v3

    sput-object v0, Lcom/c/b/bu$c$b;->c:[I

    return-void
.end method
