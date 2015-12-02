.class public Lcom/qihoo/security/h/i;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static a:Ljava/lang/String;

.field public static b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 13
    sget-object v0, Lcom/qihoo/security/env/a;->b:Ljava/lang/String;

    sput-object v0, Lcom/qihoo/security/h/i;->a:Ljava/lang/String;

    .line 15
    sget-object v0, Lcom/qihoo/security/env/a;->c:Ljava/lang/String;

    sput-object v0, Lcom/qihoo/security/h/i;->b:Ljava/lang/String;

    return-void
.end method
