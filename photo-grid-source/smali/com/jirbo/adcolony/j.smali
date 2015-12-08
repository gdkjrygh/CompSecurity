.class abstract Lcom/jirbo/adcolony/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field o:Lcom/jirbo/adcolony/d;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/d;)V
    .locals 1

    .prologue
    .line 9
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/jirbo/adcolony/j;-><init>(Lcom/jirbo/adcolony/d;Z)V

    .line 10
    return-void
.end method

.method constructor <init>(Lcom/jirbo/adcolony/d;Z)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/jirbo/adcolony/j;->o:Lcom/jirbo/adcolony/d;

    .line 15
    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Lcom/jirbo/adcolony/d;->a(Lcom/jirbo/adcolony/j;)V

    .line 16
    :cond_0
    return-void
.end method


# virtual methods
.method abstract a()V
.end method
