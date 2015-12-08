.class public final Lcom/c/b/ap$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/ap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lcom/c/b/ak$f;

.field public final b:Lcom/c/b/bd;


# direct methods
.method private constructor <init>(Lcom/c/b/ak$f;Lcom/c/b/bd;)V
    .locals 0

    .prologue
    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 131
    iput-object p1, p0, Lcom/c/b/ap$b;->a:Lcom/c/b/ak$f;

    .line 132
    iput-object p2, p0, Lcom/c/b/ap$b;->b:Lcom/c/b/bd;

    .line 133
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/ak$f;Lcom/c/b/bd;B)V
    .locals 0

    .prologue
    .line 115
    invoke-direct {p0, p1, p2}, Lcom/c/b/ap$b;-><init>(Lcom/c/b/ak$f;Lcom/c/b/bd;)V

    return-void
.end method
