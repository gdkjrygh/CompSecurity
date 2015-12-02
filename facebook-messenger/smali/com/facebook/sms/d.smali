.class public Lcom/facebook/sms/d;
.super Ljava/lang/Object;
.source "SmsInitializer.java"

# interfaces
.implements Lcom/facebook/base/c;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 14
    const-class v0, Lcom/facebook/sms/d;

    sput-object v0, Lcom/facebook/sms/d;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/facebook/sms/d;->b:Landroid/content/Context;

    .line 20
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 24
    sget-object v0, Lcom/facebook/sms/d;->a:Ljava/lang/Class;

    const-string v1, "SmsInitializer.init"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 25
    return-void
.end method
