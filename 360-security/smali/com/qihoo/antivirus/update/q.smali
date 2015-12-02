.class public Lcom/qihoo/antivirus/update/q;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lcom/qihoo/antivirus/update/q;->a:Ljava/lang/String;

    .line 8
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 11
    iget-object v0, p0, Lcom/qihoo/antivirus/update/q;->a:Ljava/lang/String;

    return-object v0
.end method
