.class Lcom/jirbo/adcolony/t$a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Ljava/lang/String;

.field b:I

.field c:Ljava/lang/String;

.field d:D


# direct methods
.method constructor <init>(Ljava/lang/String;DLjava/lang/String;I)V
    .locals 0

    .prologue
    .line 224
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 225
    iput-object p1, p0, Lcom/jirbo/adcolony/t$a;->c:Ljava/lang/String;

    .line 226
    iput-wide p2, p0, Lcom/jirbo/adcolony/t$a;->d:D

    .line 227
    iput-object p4, p0, Lcom/jirbo/adcolony/t$a;->a:Ljava/lang/String;

    .line 228
    iput p5, p0, Lcom/jirbo/adcolony/t$a;->b:I

    .line 229
    return-void
.end method
