.class public interface abstract Lcom/cleanmaster/func/process/IPhoneMemoryInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 52
    new-instance v0, Lcom/cleanmaster/func/process/a;

    invoke-direct {v0}, Lcom/cleanmaster/func/process/a;-><init>()V

    sput-object v0, Lcom/cleanmaster/func/process/IPhoneMemoryInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public abstract a()J
.end method
