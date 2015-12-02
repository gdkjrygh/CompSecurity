.class public Lcom/qihoo/security/engine/ave/dejavu/DalvikClass;
.super Ljava/lang/Object;


# static fields
.field public static final DIRECT_METHOD:I = 0x1

.field public static final VIRTUAL_METHOD:I


# instance fields
.field private c:J

.field private f:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public native findMethod(Ljava/lang/String;Ljava/lang/String;III)I
.end method

.method public native getCount(C)I
.end method

.method public native invokeMethod(II[B[BI)I
.end method

.method public native release()V
.end method
