.class final Lcom/kik/m/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/m/h$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/m/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/kik/m/h$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lorg/apache/http/util/ByteArrayBuffer;[BI)V
    .locals 1

    .prologue
    .line 35
    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0, p3}, Lorg/apache/http/util/ByteArrayBuffer;->append([BII)V

    .line 36
    return-void
.end method
