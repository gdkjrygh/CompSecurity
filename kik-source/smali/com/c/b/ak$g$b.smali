.class public final enum Lcom/c/b/ak$g$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/ak$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field public static final enum a:Lcom/c/b/ak$g$b;

.field public static final enum b:Lcom/c/b/ak$g$b;

.field public static final enum c:Lcom/c/b/ak$g$b;

.field private static final synthetic e:[Lcom/c/b/ak$g$b;


# instance fields
.field private final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 129
    new-instance v0, Lcom/c/b/ak$g$b;

    const-string v1, "UNKNOWN"

    const-string v2, "unknown"

    invoke-direct {v0, v1, v3, v2}, Lcom/c/b/ak$g$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/c/b/ak$g$b;->a:Lcom/c/b/ak$g$b;

    .line 130
    new-instance v0, Lcom/c/b/ak$g$b;

    const-string v1, "PROTO2"

    const-string v2, "proto2"

    invoke-direct {v0, v1, v4, v2}, Lcom/c/b/ak$g$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/c/b/ak$g$b;->b:Lcom/c/b/ak$g$b;

    .line 131
    new-instance v0, Lcom/c/b/ak$g$b;

    const-string v1, "PROTO3"

    const-string v2, "proto3"

    invoke-direct {v0, v1, v5, v2}, Lcom/c/b/ak$g$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/c/b/ak$g$b;->c:Lcom/c/b/ak$g$b;

    .line 128
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/c/b/ak$g$b;

    sget-object v1, Lcom/c/b/ak$g$b;->a:Lcom/c/b/ak$g$b;

    aput-object v1, v0, v3

    sget-object v1, Lcom/c/b/ak$g$b;->b:Lcom/c/b/ak$g$b;

    aput-object v1, v0, v4

    sget-object v1, Lcom/c/b/ak$g$b;->c:Lcom/c/b/ak$g$b;

    aput-object v1, v0, v5

    sput-object v0, Lcom/c/b/ak$g$b;->e:[Lcom/c/b/ak$g$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .prologue
    .line 133
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 134
    iput-object p3, p0, Lcom/c/b/ak$g$b;->d:Ljava/lang/String;

    .line 135
    return-void
.end method

.method static synthetic a(Lcom/c/b/ak$g$b;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Lcom/c/b/ak$g$b;->d:Ljava/lang/String;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/c/b/ak$g$b;
    .locals 1

    .prologue
    .line 128
    const-class v0, Lcom/c/b/ak$g$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$g$b;

    return-object v0
.end method

.method public static values()[Lcom/c/b/ak$g$b;
    .locals 1

    .prologue
    .line 128
    sget-object v0, Lcom/c/b/ak$g$b;->e:[Lcom/c/b/ak$g$b;

    invoke-virtual {v0}, [Lcom/c/b/ak$g$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/c/b/ak$g$b;

    return-object v0
.end method
