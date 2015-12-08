.class public final Lcom/c/b/bu$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/bu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/bu$c$a;,
        Lcom/c/b/bu$c$b;
    }
.end annotation


# instance fields
.field private final a:Z

.field private final b:I


# direct methods
.method private constructor <init>(ZI)V
    .locals 0

    .prologue
    .line 1196
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1197
    iput-boolean p1, p0, Lcom/c/b/bu$c;->a:Z

    .line 1198
    iput p2, p0, Lcom/c/b/bu$c;->b:I

    .line 1199
    return-void
.end method

.method synthetic constructor <init>(ZIB)V
    .locals 0

    .prologue
    .line 1173
    invoke-direct {p0, p1, p2}, Lcom/c/b/bu$c;-><init>(ZI)V

    return-void
.end method
